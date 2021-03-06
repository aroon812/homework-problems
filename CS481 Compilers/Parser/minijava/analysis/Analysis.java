/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.analysis;

import minijava.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAMainClass(AMainClass node);
    void caseAArray(AArray node);
    void caseABaseDeclClassDecl(ABaseDeclClassDecl node);
    void caseAExtendsDeclClassDecl(AExtendsDeclClassDecl node);
    void caseABaseDecl(ABaseDecl node);
    void caseAExtendsDecl(AExtendsDecl node);
    void caseAVarDecl(AVarDecl node);
    void caseAIntType(AIntType node);
    void caseABooleanType(ABooleanType node);
    void caseAIntarrayType(AIntarrayType node);
    void caseAObjectType(AObjectType node);
    void caseAMethodDecl(AMethodDecl node);
    void caseAFormalList(AFormalList node);
    void caseAFormalsTail(AFormalsTail node);
    void caseAFormal(AFormal node);
    void caseABlockStmt(ABlockStmt node);
    void caseAIfStmt(AIfStmt node);
    void caseAWhileStmt(AWhileStmt node);
    void caseAPrintStmt(APrintStmt node);
    void caseAAsmtStmt(AAsmtStmt node);
    void caseAArrayAsmtStmt(AArrayAsmtStmt node);
    void caseABlock(ABlock node);
    void caseATrueBool(ATrueBool node);
    void caseAFalseBool(AFalseBool node);
    void caseATailExplist(ATailExplist node);
    void caseAHeadExplist(AHeadExplist node);
    void caseAEmptyExplist(AEmptyExplist node);
    void caseADotopFunction(ADotopFunction node);
    void caseALengthFunction(ALengthFunction node);
    void caseAAndExp(AAndExp node);
    void caseANotandExp(ANotandExp node);
    void caseALessthanLessthan(ALessthanLessthan node);
    void caseANotlessthanLessthan(ANotlessthanLessthan node);
    void caseAMinusMinusplus(AMinusMinusplus node);
    void caseAPlusMinusplus(APlusMinusplus node);
    void caseAMinusplusMinusplus(AMinusplusMinusplus node);
    void caseAMultMult(AMultMult node);
    void caseAMult1Mult(AMult1Mult node);
    void caseANotNotexp(ANotNotexp node);
    void caseANot1Notexp(ANot1Notexp node);
    void caseALiteralBracdot(ALiteralBracdot node);
    void caseAThisBracdot(AThisBracdot node);
    void caseAArrayindexBracdot(AArrayindexBracdot node);
    void caseAFunctionBracdot(AFunctionBracdot node);
    void caseAArraydeclBracdot(AArraydeclBracdot node);
    void caseAObjectdeclBracdot(AObjectdeclBracdot node);
    void caseAParensBracdot(AParensBracdot node);
    void caseAParensParens(AParensParens node);
    void caseAIdLiteral(AIdLiteral node);
    void caseANumLiteral(ANumLiteral node);
    void caseABoolLiteral(ABoolLiteral node);

    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTStar(TStar node);
    void caseTNot(TNot node);
    void caseTAnd(TAnd node);
    void caseTLt(TLt node);
    void caseTAsmt(TAsmt node);
    void caseTEquals(TEquals node);
    void caseTComma(TComma node);
    void caseTSemi(TSemi node);
    void caseTDot(TDot node);
    void caseTLparen(TLparen node);
    void caseTRparen(TRparen node);
    void caseTLbracket(TLbracket node);
    void caseTRbracket(TRbracket node);
    void caseTLbrace(TLbrace node);
    void caseTRbrace(TRbrace node);
    void caseTBoolean(TBoolean node);
    void caseTClas(TClas node);
    void caseTElse(TElse node);
    void caseTExtends(TExtends node);
    void caseTFalse(TFalse node);
    void caseTIf(TIf node);
    void caseTInt(TInt node);
    void caseTLength(TLength node);
    void caseTMain(TMain node);
    void caseTNew(TNew node);
    void caseTPublic(TPublic node);
    void caseTReturn(TReturn node);
    void caseTStatic(TStatic node);
    void caseTString(TString node);
    void caseTPrint(TPrint node);
    void caseTThis(TThis node);
    void caseTTrue(TTrue node);
    void caseTVoid(TVoid node);
    void caseTWhile(TWhile node);
    void caseTId(TId node);
    void caseTNum(TNum node);
    void caseTWhitespace(TWhitespace node);
    void caseTBlockComment(TBlockComment node);
    void caseTEolComment(TEolComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
