package br.com.inmetrics.teste.support;

public class MassaDeDados {

	public String getUsuario() throws Exception {
		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
		return ExcelUtils.getCellData(0, 0);
	}
	
	public String getSenha() throws Exception {
		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
		return ExcelUtils.getCellData(0, 1);
	}
	
	public String getNome() throws Exception {
		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
		return ExcelUtils.getCellData(1, 0);
	}

	public String getCargo() throws Exception {
		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
		return ExcelUtils.getCellData(1, 1);
	}
	
//	public String getCpf() throws Exception {
//		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
//		return ExcelUtils.getCellData(1, 2);
//	}
//	
//	public String getSalario() throws Exception {
//		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
//		return ExcelUtils.getCellData(1, 3);
//	}
//	
//	public String getAdmissao() throws Exception {
//		ExcelUtils.setExcelFile(ExcelUtils.Path_TestData + ExcelUtils.File_TestData, "Planilha1");
//		return ExcelUtils.getCellData(1, 3);
//	}
}
