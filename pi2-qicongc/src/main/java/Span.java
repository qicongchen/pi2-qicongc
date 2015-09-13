

/* First created by JCasGen Sun Sep 13 15:13:50 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Include the beginning and end positions 
 * Updated by JCasGen Sun Sep 13 18:03:51 EDT 2015
 * XML source: /Users/yuchenluo/git/pi2-qicongc/pi2-qicongc/src/main/resources/pi2-qicongc-typesystem.xml
 * @generated */
public class Span extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Span.class);
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
  protected Span() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Span(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Span(JCas jcas) {
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
  //* Feature: Begin

  /** getter for Begin - gets Beginning position.
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (Span_Type.featOkTst && ((Span_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "Span");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Span_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets Beginning position. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (Span_Type.featOkTst && ((Span_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "Span");
    jcasType.ll_cas.ll_setIntValue(addr, ((Span_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets End position.
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (Span_Type.featOkTst && ((Span_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "Span");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Span_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets End position. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (Span_Type.featOkTst && ((Span_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "Span");
    jcasType.ll_cas.ll_setIntValue(addr, ((Span_Type)jcasType).casFeatCode_End, v);}    
  }

    