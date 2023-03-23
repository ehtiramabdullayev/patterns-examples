package rulesEngine.better.model;

public class Choice {

  private String model;
  private BrandType brandType;

  public Choice(BrandType brandType) {
    this.brandType = brandType;
  }

  public Choice() {

  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public BrandType getBrandType() {
    return brandType;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Phone{");
    sb.append("model='").append(model).append('\'');
    sb.append(", osType=").append(brandType);
    sb.append('}');
    return sb.toString();
  }
}