package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "themes_localizations")
public class ThemeLocalization {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "theme_localization_id")
  private int id;

  @ManyToOne
  @JoinColumn(name = "localizations_id")
  private Localization localization;

  @ManyToOne
  @JoinColumn(name = "themes_id")
  private Theme theme;

  private String name;
}
