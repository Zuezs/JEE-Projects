package com.eintern.training.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Circle implements Shape, ApplicationEventPublisherAware{

	
	private Point center;
	private ApplicationEventPublisher publisher;
	@Autowired
	private MessageSource messagesource;
	
	@Override
	public void draw() {
		System.out.println(this.messagesource.getMessage("drawing.circle", null, "Default Greeting", null));
		System.out.println(this.messagesource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	public MessageSource getMessagesource() {
		return messagesource;
	}

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="PointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
			
		this.publisher = publisher;
	}
	
	/*@PostConstruct
	public void intializeCircle(){
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy Circle");
	}*/

}
