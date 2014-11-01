/*
 * WDean Medical is distributed under the
 * GNU Lesser General Public License (GNU LGPL).
 * For details see: http://www.wdeanmedical.com
 * copyright 2013-2014 WDean Medical
 */
 
package com.wdeanmedical.ehr.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tx_code")
public class TxCode extends BaseEntity implements Serializable {
	
  private static final long serialVersionUID = 5720513734442717987L;
  
  private Integer encounterId;
  private CPT cpt;
  private CPTModifier cptModifier;
  private Encounter encounter;
  
  
  public TxCode() {
  }
  
  

  @Column(name = "encounter_id")
  public Integer getEncounterId() { return encounterId; }
  public void setEncounterId(Integer encounterId) { this.encounterId = encounterId; }

  @JoinColumn(name = "cpt", referencedColumnName = "id")
  @ManyToOne(optional = true)
  public CPT getCpt() { return cpt; }
  public void setCpt(CPT cpt) { this.cpt = cpt; }

  @JoinColumn(name = "cpt_modifier", referencedColumnName = "id")
  @ManyToOne(optional = true)
  public CPTModifier getCptModifier() { return cptModifier; }
  public void setCptModifier(CPTModifier cptModifier) { this.cptModifier = cptModifier; }
  
  @JoinColumn(name = "encounter_id", referencedColumnName = "id", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  public Encounter getEncounter() { return encounter; }
  public void setEncounter(Encounter encounter) { this.encounter = encounter; }


}
