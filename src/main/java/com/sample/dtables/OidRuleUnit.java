package com.sample.dtables;


import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

import com.sample.model.Oid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OidRuleUnit implements RuleUnitData {
    private DataStore<Oid> oids = DataSource.createStore();
}
