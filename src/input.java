public class input 
{
    public static void main(String[] args)
    {
        getDouble();
    }
    

    private static void getString()
    {
        inputData inData = new inputData();
        String textString = inData.getString("Szöveg");
        System.out.println("Ezt irtad: " + textString);        
    }

    private static void getTnteger()
    {
        inputData inData = new inputData();
        Integer textInteger = inData.getInteger("Szám");
        System.out.println("Ezt irtad: " + textInteger);
    }
    private static void getDouble() 
    {
        inputData inData = new inputData();
        double textDouble = inData.getDouble("Szám");
        System.out.println("Ezt irtad: " + textDouble);
        
    }
}
