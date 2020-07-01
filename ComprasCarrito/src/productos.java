
public class productos {

	String nombre []= {};
	String categoria[]= {};
	String marca[]= {};
	double[] precio= {};
	
	public productos() {
		
	}
	public productos(String nombre[], double precio[], String marca[], String categoria[]) {
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.categoria=categoria;
	}

	public String[] getNombre() {
		return nombre;
	}
public String[] setNombre() {
	return nombre;
}
	public double[] getPrecio() {
		return precio;
	}

	public void setPrecio(double[] precio) {
		this.precio = precio;
	}

	public String[] getMarca() {
		return marca;
	}

	public void setMarca(String[] marca) {
		this.marca = marca;
	}

	public String[] getCategoria() {
		return categoria;
	}

	public void setCategoria(String[] categoria) {
		this.categoria = categoria;
	}



/*public void Caro() {

		if (this.getPrecio() > caro)
			
		{
			caro = this.getPrecio();
			ns = this.getNombre();
	}

		if ( this.getPrecio() < barato) {
			barato = this.getPrecio();
			nb= this.getNombre();
		}
	}
*/
	public void cargar() {
		for(int i = 0; i < nombre.length; i++){
			this.nombre(nombre);
			this.setMarca(marca);
			this.setPrecio(precio);
			this.setCategoria(categoria);
		}
		System.out.println("Categoria: " + this.getCategoria() + "Marca: " + this.getMarca() +
				"Nombre: " + this.getNombre()  + "Precio:$ " + this.getPrecio());
		}
		

	private void nombre(String[] nombre2) {
		// TODO Auto-generated method stub
		
	}
	public void imprimir() {
		System.out.println("Su carrito tiene :"); 
		System.out.println("Categoria: "+ categoria + "El producto es: " + nombre +  "Precio: $" + precio);
        
	}
}
