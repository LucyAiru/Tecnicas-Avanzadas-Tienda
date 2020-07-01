
public class compra extends productos {

	double suma;
	double resta;
	double compra;
	int cantidad;
    int stock;
	
productos p = new productos();

public void sumar() {

	compra=0;
	suma=0;
	
	if(cantidad <2) {
		
		cantidad ++;
		//suma= p.precio + p.precio; // y si son mas de dos como sumo con un for y un acomulador 
		compra= suma;
	}

}
public void restar() {
	resta=0;
	
	if (cantidad > stock ) {
		resta= stock - cantidad;
	}
}
public void contadorcantidad() {
  for ( int i=0; i<cantidad; i++ ) {
  
//	  this.cantidad(i);
	  
  }
  }
}