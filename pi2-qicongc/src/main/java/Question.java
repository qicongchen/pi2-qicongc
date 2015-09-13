

/* First created by JCasGen Sun Sep 13 15:13:50 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** Include the Text of a question.
 * Updated by JCasGen Sun Sep 13 18:03:51 EDT 2015
 * XML source: /Users/yuchenluo/git/pi2-qicongc/pi2-qicongc/src/main/resources/pi2-qicongc-typesystem.xml
 * @generated */
public class Question extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets Text of the question.
   * @generated
   * @return value of the feature 
   */
  public Text getText() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Question");
    return (Text)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_Text)));}
    
  /** setter for Text - sets Text of the question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(Text v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_Text, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Precision

  /** getter for Precision - gets Precision at N, the number of correct answers.
   * @generated
   * @return value of the feature 
   */
  public double getPrecision() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Question");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets Precision at N, the number of correct answers. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(double v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Question");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_Precision, v);}    
   
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets Unique question id.
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets Unique question id. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_Id, v);}    
  }

    