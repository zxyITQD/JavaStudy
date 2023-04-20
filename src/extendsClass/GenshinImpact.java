package extendsClass;

public class GenshinImpact {
    private String partName; // 角色
    private String eleType; // 元素类型

    public String getPartName() {
        return partName;
    }
// 父类无空参构造
    public GenshinImpact(String partName, String eleType) {
        this.partName = partName;
        this.eleType = eleType;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getEleType() {
        return eleType;
    }

    public void setEleType(String eleType) {
        this.eleType = eleType;
    }
    public void godTask(){
        System.out.println("魔神任务开启！请旅行者查看");
    }

}
