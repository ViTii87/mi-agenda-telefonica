
/**
 * Write a description of class TestArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TestAgendaTelefonica
{
    private int numeroTestsFallados;

    /**
     * Constructor for objects of class TestArrayListInt
     */
    public TestAgendaTelefonica()
    {   
        numeroTestsFallados = 0;
        
        AgendaTelefonica miAgenda = new AgendaTelefonica();
        
        numeroTestsFallados += testea(null, miAgenda.lookupNumber("Paco"), "lookUpNumber()");
        
        miAgenda.enterNumber("Pepe","123456789");
        miAgenda.enterNumber("Alberto", "674639726");
        
        numeroTestsFallados += testea(null, miAgenda.lookupNumber("Rodrigo"), "lookUpNumber()");
        numeroTestsFallados += testea("674639726", miAgenda.lookupNumber("Alberto"), "lookUpNumber()");
        
        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }


    public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }

}