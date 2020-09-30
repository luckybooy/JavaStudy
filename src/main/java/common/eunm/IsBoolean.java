package common.eunm;

/**
 * 测试枚举类写法
 */
public enum IsBoolean {
    TRUE(1,"是"),
    FALSE(2,"否");

    private Integer status;
    private String desc;

    IsBoolean(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescByStatus(Integer status){
        if (status == null) {
            return null;
        }
        for (IsBoolean temp: IsBoolean.values()){
            if (temp.getStatus().equals(status)){
                return temp.getDesc();
            }
        }
        return null;
    }
}
