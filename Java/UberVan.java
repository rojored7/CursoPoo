class UberVan extends Car{
    Map<String, Arraylist<String,Interger>> typeCarAccepted;
    Arraylist<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Arraylist<String,Interger>> typeCarAccepted, Arraylist<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;


    }
}