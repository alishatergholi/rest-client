package ir.vasl.library.enums;



public enum RequestBodyType {

    FormData(0),
    FormUrlEncode(1),
    RawJSON(2),
    RawTEXTPlain(3),
    Binary(4),;

    int value = -1;

    RequestBodyType(int value){
        this.value = value;
    }

    public static RequestBodyType Parse(int value) {
        if (value == 0) {
            return FormData;
        }
        RequestBodyType[] arr$ = values();
        for (RequestBodyType val : arr$) {
            if (val.value == value) {
                return val;
            }
        }
        return FormData;
    }

}
