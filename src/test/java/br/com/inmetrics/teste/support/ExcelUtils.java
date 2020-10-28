package br.com.inmetrics.teste.support;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static final String Path_TestData = "src\\test\\resources\\data\\";
    public static final String File_TestData = "massa.xlsx";
	
	public static void setExcelFile(String caminhoArquivo, String nomeDoArquivo) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(caminhoArquivo);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(nomeDoArquivo);
		} catch (Exception e) {
			throw (e);
		}
	}

	public static String getCellData(int numeroDaLinha, int numeroDaColuna) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(numeroDaLinha).getCell(numeroDaColuna);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}
}