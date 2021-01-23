package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "themes_localizations")
public class ThemeLocalization {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @OneToOne
  private LocalName localName;

  private String name;
}
