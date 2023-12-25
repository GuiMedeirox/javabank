package workingWithEnum;

import java.lang.reflect.Type;

public enum TypeAccount {
    BUSINESS_ACCOUNT("BUSINESS", 0.25f){
        @Override
        public float getTariff(float value){
            return value*0.1f;
        }
        @Override
        public String getTYPE(TypeAccount typeAccount){
            return typeAccount.TYPE;
        }
    },
    PERSONAL_ACCOUNT("PERSONAL", 0){
        @Override
        public float getTariff(float value){
            return 0;
        }
        @Override
        public String getTYPE(TypeAccount typeAccount){
            return typeAccount.TYPE;
        }
    };

    public static TypeAccount findByField(String field){
        for(TypeAccount typeAccount: values()){
            if(typeAccount.getTYPE(typeAccount).equals(field)){
                return typeAccount;
            }
        }
        return null;
    }
    public final float VALUE;
    public final String TYPE;
    public abstract  String getTYPE(TypeAccount typeAccount);
    public abstract  float getTariff(float value);
    TypeAccount(String type, float value){
        this.VALUE = value;
        this.TYPE = type;
    }

}
