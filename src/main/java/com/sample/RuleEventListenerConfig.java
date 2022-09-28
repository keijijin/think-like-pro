package com.sample;

import javax.enterprise.context.ApplicationScoped;

import org.drools.core.config.DefaultRuleEventListenerConfig;

import com.sample.utils.TrackingAgendaEventListener;

@ApplicationScoped
public class RuleEventListenerConfig extends DefaultRuleEventListenerConfig {
	public RuleEventListenerConfig() {
		super(new TrackingAgendaEventListener());
	}
}
