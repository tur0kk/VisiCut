package com.tur0kk.thingiverse.model;

import javax.swing.ImageIcon;

/**
 * @author Patrick Schmidt
 */
public class ThingFile
{
  String id;
  String name;
  String url;
  String thumbnailUrl;
  ImageIcon thumbnail;
  Thing thing;
  
  public ThingFile(String id, String name, String url, String thumbnailUrl, Thing thing)
  {
    this.id = id;
    this.name = name;
    this.url = url;
    this.thumbnailUrl = thumbnailUrl;
    this.thing = thing;
  }

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getUrl()
  {
    return url;
  }

  public String getThumbnailUrl()
  {
    return thumbnailUrl;
  }

  public ImageIcon getThumbnail()
  {
    return thumbnail;
  }

  public void setThumbnail(ImageIcon thumbnail)
  {
    this.thumbnail = thumbnail;
  }
  
  public Thing getThing()
  {
    return this.thing;
  }
  
  @Override
  public String toString()
  {
    return "Thing File: " + name;
  }
}
