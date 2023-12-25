package workingWithEnum;

public enum TypeAccount {
    BUSINESS_ACCOUNT("BUSINESS", 0.25f){
        @Override
        public float getTariff(float value){
            return value*0.1f;
        }
    },
    PERSONAL_ACCOUNT("PERSONAL", 0){
        @Override
        public float getTariff(float value){
            return 0;
        }
    };

    public final float VALUE;
    public final String TYPE;
    public abstract  float getTariff(float value);
    TypeAccount(String type, float value){
        this.VALUE = value;
        this.TYPE = type;
    }

}
