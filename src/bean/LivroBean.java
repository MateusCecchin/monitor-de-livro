package bean;

public class LivroBean {
	private Integer id;
	private String nome;
	private Boolean alugado;
	
	public void setId(Integer id) {
		this.id = id;		
	}
	 
	public Integer getId() {
		return id;
	}
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAlugado(Boolean alugado) {
		this.alugado = alugado;
	}
	
	public Boolean getAlugado() {
		return alugado;
	}
}
