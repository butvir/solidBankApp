package kz.singularity.bolatov.solidbankapp.model;

public enum AccountType {
    CHECKING("CHECKING"),
    SAVING("SAVING"),
    FIXED("FIXED");

    private String type;

    public String getType(){
        return type;
    }

    AccountType(String type){
        this.type = type;
    }
}
