

/* First created by JCasGen Sun Sep 13 15:13:50 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** Include the Text, the correct label, and the score of an answer.
 * Updated by JCasGen Sun Sep 13 18:03:51 EDT 2015
 * XML source: /Users/yuchenluo/git/pi2-qicongc/pi2-qicongc/src/main/resources/pi2-qicongc-typesystem.xml
 * @generated */
public class Answer extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
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
  //* Feature: Correct

  /** getter for Correct - gets Whether this answer is correct.
   * @generated
   * @return value of the feature 
   */
  public boolean getCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Correct == null)
      jcasType.jcas.throwFeatMissing("Correct", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_Correct);}
    
  /** setter for Correct - sets Whether this answer is correct. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Correct == null)
      jcasType.jcas.throwFeatMissing("Correct", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_Correct, v);}    
   
    
  //*--------------*
  //* Feature: Score

  /** getter for Score - gets Score of this answer.
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets Score of this answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score, v);}    
   
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets Text of the answer.
   * @generated
   * @return value of the feature 
   */
  public Text getText() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Answer");
    return (Text)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_Text)));}
    
  /** setter for Text - sets Text of the answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(Text v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_Text, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets Unique answer id.
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets Unique answer id. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: QuestionId

  /** getter for QuestionId - gets The question this answer refers to.
   * @generated
   * @return value of the feature 
   */
  public String getQuestionId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_QuestionId == null)
      jcasType.jcas.throwFeatMissing("QuestionId", "Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_QuestionId);}
    
  /** setter for QuestionId - sets The question this answer refers to. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionId(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_QuestionId == null)
      jcasType.jcas.throwFeatMissing("QuestionId", "Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_QuestionId, v);}    
  }

    