package model;

public class Pagina {
	private String titulo;
	private String url;
	private String[] seo;
	private String descriocion;
	
	public Pagina() {
		
	}

	
	public Pagina(String titulo, String url, String[] seo, String descriocion) {
		super();
		this.titulo = titulo;
		this.url = url;
		this.seo = seo;
		this.descriocion = descriocion;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getSeo() {
		return seo;
	}

	public void setSeo(String[] seo) {
		this.seo = seo;
	}

	public String getDescriocion() {
		return descriocion;
	}

	public void setDescriocion(String descriocion) {
		this.descriocion = descriocion;
	}
	
}
