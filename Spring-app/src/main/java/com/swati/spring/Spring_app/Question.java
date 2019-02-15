package com.swati.spring.Spring_app;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	int questionId; 
	String question;
	List answerList;
	Set answerSet;
	Map answerMap;
	public Question() {
		super();
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswerList(List answerList) {
		this.answerList = answerList;
	}
	public void setAnswerSet(Set answerSet) {
		this.answerSet = answerSet;
	}
	public void setAnswerMap(Map answerMap) {
		this.answerMap = answerMap;
	}
	
	public int getQuestionId() {
		System.out.println(questionId);
		return questionId;
	}
	public String getQuestion() {
		System.out.println(question);
		return question;
	}
	public List getAnswerList() {
		System.out.println(answerList);
		return answerList;
	}
	
	public Set getAnswerSet() {
		System.out.println(answerSet);
		return answerSet;
	}
	public Map getAnswerMap() {
		System.out.println(answerMap);
		return answerMap;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answerList=" + answerList + ", answerSet=" + answerSet
				+ ", answerMap=" + answerMap + "]";
	}
	
}
