/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Assignment cEntitiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_0 = (RuleCall)cEntitiesAssignment.eContents().get(0);
		
		//Model:
		//	entities+=Entity*;
		@Override public ParserRule getRule() { return rule; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment() { return cEntitiesAssignment; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_0() { return cEntitiesEntityParserRuleCall_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//	'entity' name=ID '{'
		//	features+=Feature*
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'entity' name=ID '{' features+=Feature* '}'
		public Group getGroup() { return cGroup; }

		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_0() { return cFeaturesFeatureParserRuleCall_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//	Attribute | Reference;
		@Override public ParserRule getRule() { return rule; }

		//Attribute | Reference
		public Alternatives getAlternatives() { return cAlternatives; }

		//Attribute
		public RuleCall getAttributeParserRuleCall_0() { return cAttributeParserRuleCall_0; }

		//Reference
		public RuleCall getReferenceParserRuleCall_1() { return cReferenceParserRuleCall_1; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttrKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//Attribute:
		//	'attr' name=ID ':' type=Type;
		@Override public ParserRule getRule() { return rule; }

		//'attr' name=ID ':' type=Type
		public Group getGroup() { return cGroup; }

		//'attr'
		public Keyword getAttrKeyword_0() { return cAttrKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//Type
		public RuleCall getTypeTypeEnumRuleCall_3_0() { return cTypeTypeEnumRuleCall_3_0; }
	}

	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeEntityCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_3_0_1 = (RuleCall)cTypeEntityCrossReference_3_0.eContents().get(1);
		
		//Reference:
		//	'ref' name=ID ':' type=[Entity];
		@Override public ParserRule getRule() { return rule; }

		//'ref' name=ID ':' type=[Entity]
		public Group getGroup() { return cGroup; }

		//'ref'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=[Entity]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//[Entity]
		public CrossReference getTypeEntityCrossReference_3_0() { return cTypeEntityCrossReference_3_0; }

		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_3_0_1() { return cTypeEntityIDTerminalRuleCall_3_0_1; }
	}
	
	
	public class TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntIntKeyword_1_0 = (Keyword)cIntEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Type:
		//	string | int;
		public EnumRule getRule() { return rule; }

		//string | int
		public Alternatives getAlternatives() { return cAlternatives; }

		//string
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }

		//"string"
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }

		//int
		public EnumLiteralDeclaration getIntEnumLiteralDeclaration_1() { return cIntEnumLiteralDeclaration_1; }

		//"int"
		public Keyword getIntIntKeyword_1_0() { return cIntIntKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final EntityElements pEntity;
	private final FeatureElements pFeature;
	private final AttributeElements pAttribute;
	private final ReferenceElements pReference;
	private final TypeElements eType;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pEntity = new EntityElements();
		this.pFeature = new FeatureElements();
		this.pAttribute = new AttributeElements();
		this.pReference = new ReferenceElements();
		this.eType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	entities+=Entity*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Entity:
	//	'entity' name=ID '{'
	//	features+=Feature*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Feature:
	//	Attribute | Reference;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Attribute:
	//	'attr' name=ID ':' type=Type;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//Reference:
	//	'ref' name=ID ':' type=[Entity];
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}

	//enum Type:
	//	string | int;
	public TypeElements getTypeAccess() {
		return eType;
	}
	
	public EnumRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
