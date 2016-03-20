package br.com.main;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jxls.area.XlsArea;
import org.jxls.command.Command;
import org.jxls.command.EachCommand;
import org.jxls.command.IfCommand;
import org.jxls.common.AreaRef;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;
import org.jxls.util.JxlsHelper;
import org.jxls.util.TransformerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.model.AtributoDTO;
import br.com.model.ProdutoDTO;

public class Main {
	static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		List<ProdutoDTO> produtos = gerarDadosProdutos();
		executeSimpleExport(produtos);
//		executeGridObjectListDemo(produtos);
//		executeAreaListener(produtos);
		
	}

	private static void executeSimpleExport(List<ProdutoDTO> produtos) throws FileNotFoundException, IOException {

		InputStream stream = Main.class.getResourceAsStream("/produtos_auditoria_v1.xlsx");
		try (OutputStream os = new FileOutputStream("target/auditoria_output1.xlsx")) {
			Context context = new Context();
			context.putVar("dados", produtos);
			JxlsHelper.getInstance().processTemplate(stream, os, context);
		}
			
	}

	private static void executeAreaListener(List<ProdutoDTO> produtos) throws IOException {

	    logger.info("Opening input stream");
	    try(InputStream is = Main.class.getResourceAsStream("/produtos_auditoria_v3.xls")) {
	        try (OutputStream os = new FileOutputStream("target/auditoria_output2.xlsx")) {
	            Transformer transformer = TransformerFactory.createTransformer(is, os);
	            System.out.println("Creating area");
	            
	            XlsArea xlsArea = new XlsArea("Auditoria!A1:E2", transformer);
	            XlsArea produtoArea = new XlsArea("Auditoria!A1:E2", transformer);
	            EachCommand produtoEachCommand = new EachCommand("produto", "produtos", produtoArea);
	            
	            XlsArea atributoArea = new XlsArea("Auditoria!D1:E2", transformer);
	            EachCommand atributoEachCommand = new EachCommand("atributo", "produto.atributos", atributoArea);
	            atributoEachCommand.setDirection(EachCommand.Direction.RIGHT);
	            produtoArea.addCommand(new AreaRef("Auditoria!D1:E2"), atributoEachCommand);
	            xlsArea.addCommand(new AreaRef("Auditoria!A1:E2"), produtoEachCommand);
	            
	            Context context = new Context();
	            context.putVar("produtos", produtos);
	            context.putVar("header", "Nome");
	            logger.info("Setting EachCommand direction to Right");
	            produtoEachCommand.setDirection(EachCommand.Direction.DOWN);
	            xlsArea.reset();
	            xlsArea.applyAt(new CellRef("Right!A1"), context);
	            xlsArea.processFormulas();
	            logger.info("Complete");
	            transformer.write();
	            logger.info("written to file");
	        }
	    }
	}

	private static void executeGridObjectListDemo(List<ProdutoDTO> produtos) throws IOException {
	    try(InputStream is = Main.class.getResourceAsStream("/grid_template.xls")) {
	        try(OutputStream os = new FileOutputStream("target/auditoria_output3.xlsx")) {
	            Context context = new Context();
	            
	            List<AtributoDTO> atributos = new ArrayList<AtributoDTO>();
	            
	            for (ProdutoDTO prod : produtos) {
					atributos.addAll(prod.getAtributos());
				}
	            
	            context.putVar("headers", Arrays.asList("Nome", "Valor"));
	            context.putVar("data", atributos);
	            
	            JxlsHelper.getInstance().processGridTemplateAtCell(is, os, context, "nome,valores", "Sheet2!A1");
	        }
	    }
	}
	private static List<ProdutoDTO> gerarDadosProdutos() {
		
		List<ProdutoDTO> produtos = new ArrayList<ProdutoDTO>();
		ProdutoDTO produtoTenis = new ProdutoDTO();
		produtoTenis.setNome("Tênis Air Max Nike");
		produtoTenis.setMarca("Nike");
		produtoTenis.setUrlVideo("https://youtube.com/67678676768");
		produtoTenis.setImagem1("http://static1.netshoes.net/Produtos/tenis-nike-the-overplay-8/56/004-5520-156/004-5520-156_detalhe1.jpg?resize=254:*");
		produtoTenis.setDepartamento("Calçados");
		produtoTenis.setAtributos(Arrays.asList(
				new AtributoDTO("Indicado Para", "Infantil|Adultos", "Nome Atributo 1", "Valor Atributo 1"),
				new AtributoDTO("Aposta", "A|B|C", "Nome Atributo 2", "Valor Atributo 2"),
				new AtributoDTO("Indicado Para", "Infantil|Adultos", "Nome Atributo 3", "Valor Atributo 3"),
				new AtributoDTO("Composição", "Algoção|Poliester", "Nome Atributo 4", "Valor Atributo 4"),
				new AtributoDTO("Público Alvo", "Fitness", "Nome Atributo 5", "Valor Atributo 5"))
		);

		ProdutoDTO produtoCamisa = new ProdutoDTO();
		produtoCamisa.setNome("Camisa Adidas");
		produtoCamisa.setMarca("Nike");
		produtoCamisa.setDepartamento("Camisas");
		produtoCamisa.setUrlVideo("https://youtube.com/67678676768");
		produtoCamisa.setImagem1("http://static1.netshoes.net/Produtos/tenis-nike-the-overplay-8/56/004-5520-156/004-5520-156_detalhe1.jpg?resize=254:*");
		produtoCamisa.setAtributos(Arrays.asList(
				new AtributoDTO("Indicado Para", "Infantil|Adultos", "Nome Atributo 1", "Valor Atributo 1"),
				new AtributoDTO("Indicado Para", "Infantil|Adultos", "Nome Atributo 2", "Valor Atributo 2"),
				new AtributoDTO("Caracteristicas", "Uso contínuo", "Nome Atributo 3", "Valor Atributo 3"),
				new AtributoDTO("Tamanho", "Pequeno|Médio|Grande", "Nome Atributo 4", "Valor Atributo 4"),
				new AtributoDTO("Indicado Uso", "Pessoal|Coletivo", "Nome Atributo 5", "Valor Atributo 5"))
		);
		produtos.add(produtoTenis);
		produtos.add(produtoCamisa);
		
		return produtos;
	}
}
