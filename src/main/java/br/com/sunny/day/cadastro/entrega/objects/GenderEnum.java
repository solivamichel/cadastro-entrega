package br.com.sunny.day.cadastro.entrega.objects;

public enum GenderEnum {

    MALE("M"),
    FEMELE("F"),
    UNINFORMED("X");

    private String value;

    GenderEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static GenderEnum fromValue(String text) {
        for(GenderEnum gender : GenderEnum.values()) {
            if(String.valueOf(gender.value).equalsIgnoreCase(text)){
                return gender;
            }
        }
        return UNINFORMED;
    }
}
