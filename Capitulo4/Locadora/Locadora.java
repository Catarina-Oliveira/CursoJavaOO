class Filme {
	int codigo;
	String nome;
	double valor;
	boolean estaDisponivel;

	public void retiraFilme (){
		if (this.estaDisponivel){
			this.estaDisponivel = false;
			System.out.println(this.nome + " retirado com sucesso!");
		}else{
			System.out.println(this.nome + " nao disponivel!");
		}
	}

	public void devolveFilme(){
		this.estaDisponivel = true;
		System.out.println (this.nome + "Filme devolvido com sucesso!");
	}

}

class Programa{
	public static void main(String[] args) {
		Filme filme = new Filme ();
		filme.codigo = 123;
		filme.nome = "A Era do Gelo";
		filme.valor = 2.50;
		filme.estaDisponivel = true;

		Filme filme2 = new Filme ();
		filme2.codigo = 321;
		filme2.nome = "A Era do Gelo 2";
		filme2.valor = 3.50;	
		filme2.estaDisponivel = false;

		Filme filme3 = new Filme ();
		filme3.codigo = 132;
		filme3.nome = "A Era do Gelo 3";
		filme3.valor = 4.00;	
		filme3.estaDisponivel = true;

		Filme filme4 = new Filme ();
		filme4.codigo = 213;
		filme4.nome = "Shrek";
		filme4.valor = 4.50;	
		filme4.estaDisponivel = false;

		Filme filme5 = new Filme ();
		filme5.codigo = 231;
		filme5.nome = "Shrek 2";
		filme5.valor = 5.00;	
		filme5.estaDisponivel = true;

		Filme filmes[] = new Filme[5];
		filmes[0] = filme;
		filmes[1] = filme2;
		filmes[2] = filme3;
		filmes[3] = filme4;
		filmes[4] = filme5;


		for (Filme film : filmes){ //para cada filme na estrutura, traz para a nova variável film (for encadeado)
			System.out.println(film);
			System.out.println(film.codigo);
			System.out.println(film.nome);
			System.out.println(film.valor);	
			System.out.println(film.estaDisponivel);
		}

		/*for (int i = 0; i < filmes.length; i++){ //condição até o tamanho do array
			System.out.println(filmes[i]);
			System.out.println(filmes[i].codigo);
			System.out.println(filmes[i].nome);
			System.out.println(filmes[i].valor);	
			System.out.println(filmes[i].estaDisponivel);
		}
		filme.retiraFilme();
		filme2.devolveFilme();

		System.out.println(filme2);
		System.out.println(filme2.codigo);
		System.out.println(filme2.nome);
		System.out.println(filme2.valor);	
		System.out.println(filme2.estaDisponivel);

		System.out.println(filme);
		System.out.println(filme.codigo);
		System.out.println(filme.nome);
		System.out.println(filme.valor);	
		System.out.println(filme.estaDisponivel);
		*/
	}
}