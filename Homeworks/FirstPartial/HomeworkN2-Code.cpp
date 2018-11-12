#include <stdio.h>
int main()
{
	//Declarar variables
	float vtotal=0, venta=0, descuento=0;
	int diaventa;
	printf(" ingrese dia ");
	scanf("%d", &diaventa);
	printf( "ingrese venta ");
	scanf("%f", &venta);
	//proceso
	switch(diaventa){
	case 1:
		if (venta>=100){
		descuento= (venta*0.1);
		vtotal= venta-descuento;
	    }
	    else{
	    descuento=0;
		break;	
		}
	case 2:    
	    if (venta>=50&&venta<=70){
		descuento= (venta*0.05);
		vtotal= venta-descuento;
	    }
	    else {
	    descuento=0;	
		}
	    break;
	case 3:
		if (venta>200){
		descuento= (venta-5);
		vtotal= venta-descuento;
	    }
	    else{
	    descuento=0;	
		}
	    break;
	case 4:
		case 5:
			if (venta>=100&&venta<=300){
		descuento= (venta*0.05);
		vtotal= venta-descuento;
	    }
	    else{
	    descuento=0;	
		}
	    break;
	case 6:
		case 7:
			if (venta>=200&&venta<=250){
		descuento= (venta*0.03);
		vtotal= venta-descuento;
	    }
	    else{
	    descuento=0;	
		}
	    break;
	default:
		printf(" descuento cero ");	
	}
	printf("Su venta es: %.2f\n", venta);
	printf("Su descuento es: %.2f\t", descuento);
	printf("Su venta total es: %.2f\0", vtotal);
}
