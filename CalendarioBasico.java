
/**
 * This is a normal calendar
 */
public class CalendarioBasico
{
    // the dia of the calendar
    private DisplayDosCaracteres dia;
    // the mes of the calendar
    private DisplayDosCaracteres mes;
    // the ano of the calendar
    private DisplayDosCaracteres ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(100);
    }

    /**
     * Set the calendar date
     */
    public void fijarFecha(int actualDia, int actualMes, int actualAno)
    {
        if (actualDia > 0 & actualMes > 0 & actualAno >0){
            dia.setValorAlmacenado(actualDia);
            mes.setValorAlmacenado(actualMes);
            ano.setValorAlmacenado(actualAno);
        }
        else{
            System.out.println ("You have to input a correct date");
        }
    }

    /**
     * Print calendar date
     */
    public String obtenerFecha()
    {
        String date;
        date = dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay();
        return date;
    }

    /**
     * Advance one dia in the calendar
     */
    public void avanzarFecha()
    {
        if (dia.getValorAlmacenado() == 30 & mes.getValorAlmacenado() == 12 & ano.getValorAlmacenado() == 99){
            dia.setValorAlmacenado(1);
            mes.setValorAlmacenado(1);
            ano.setValorAlmacenado(1);
        }
        else if (dia.getValorAlmacenado() == 30 & mes.getValorAlmacenado() == 12){
            dia.setValorAlmacenado(1);
            mes.setValorAlmacenado(1);
            ano.incrementaValorAlmacenado();
        }
        else if (dia.getValorAlmacenado() == 30){
            dia.setValorAlmacenado(1);
            mes.incrementaValorAlmacenado();
        }
        else{
            dia.incrementaValorAlmacenado();
        }
    }

    /**
     * Get a 8 characters string of the date
     */
    public String getString()
    {
        String date;
        date = dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-20" + ano.getTextoDelDisplay();
        return date;
    }
}
