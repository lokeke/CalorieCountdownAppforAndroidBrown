package ese.com.caloriecountdownappforandroidbrown;

public interface JSONWrapperCIFInterface
//JSONWrapperCIF6Interface
{
  public String Code_JSONText();
  public Transactions_CIF22 DeCode_JSONText(String json_input);
  public void Set_JSONText(String json_input);
  public String Get_JSONText();
  public String Nutritional_Object_to_JSONText(Nutritional_Content_CiFragmented_Object001 INPUT);


}
