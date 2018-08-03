class Empresa{
	private String razaoSocial;
	private String cnpj;
	private Funcionario funcionarios[];
	
	public void adicionaFuncionario (Funcionario funcionario){
		for (int i = 0; i < this.funcionarios.length; i++){
			if(this.funcionarios[i] == null){
				this.funcionarios[i] = funcionario;
			}
		}

	}

	public String getRazaoSocial(){
		return this.razaoSocial;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}

	public Funcionario[] getArrayFuncionarios(){
		return this.funcionarios;
	}

	public void setRazaoSocial(String razaoSocial){
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public void setArrayFuncionarios(Funcionario[] funcionarios){
		this.funcionarios = funcionarios;
	}
}

class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	public String getNome(){
		return this.nome;
	}

	public String getDepartamento(){
		return this.departamento;
	}

	public double getSalario(){
		return this.salario;
	}

	public String getDataEntrada(){
		return this.dataEntrada;
	}

	public String getRg(){
		return this.rg;
	}

	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public void setDataEntrada(String dataEntrada){
		this.dataEntrada = dataEntrada;
	}

	public void setRg (String rg){
		this.rg = rg;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public void bonifica(double valor){
		this.salario += valor;
	}

	public void demite(){
		this.estaNaEmpresa = false;
	}

	public double calculaGanhoAnual(){
		return (12 * this.salario); 
	}
}

class Programa{
	public static void main(String[] args){
		Empresa empresa = Empresa();
		empresa.setRazaoSocial ("Happy Code");
		empresa.setCnpj ("5398493274//099");

		Funcionario[] funcionarios = new Funcionario[3];
		empresa.setArrayFuncionarios(funcionarios);

		Funcionario func1 = new Funcionario();
		func1.setNome ("Catarina Oliveira");
		func1.setDepartamento ("Professor");
		func1.setSalario (900);
		func1.setDataEntrada ("02/05/2018");
		func1.setRg ("38.476.249-9");
		func1.setEstaNaEmpresa (true);

		funcionarios[0] = func1;

		Funcionario func2 = new Funcionario();
		func2.setNome ("Alexandre Ferro");
		func2.setDepartamento ("RH");
		func2.setSalario (1200);
		func2.setDataEntrada ("01/03/2018");
		func2.setRg ("25.874.987-3");
		func2.setEstaNaEmpresa (true);

		funcionarios.[1] = func2;

		Funcionario func3 = new Funcionario();
		func3.setNome ("Gabriel Estrela");
		func3.setDepartamento ("Faxina");
		func3.setSalario (900);
		func3.setDataEntrada ("12/05/2017");
		func3.setRg ("48.957.243-4");
		func3.setEstaNaEmpresa (true);

		funcionarios[2] = func3;

		empresa.adicionaFuncionario(funcionarios[0]);
		empresa.adicionaFuncionario(funcionarios[1]);
		empresa.adicionaFuncionario(funcionarios[2]);
	}
}