package com.sknn.tiles.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * Project: struts2tiles.
 * Package: com.sknn.tiles.action.
 * User: Administrator.
 * Date: 2017-11-16 13:10.
 * Author: Haiyangp.
 */
public class TilesAction extends ActionSupport {

  private static final long serialVersionUID = 7991975226788681001L;

  /**
   * Tile string.
   *
   * @return the tile page name
   */
  public String tile() {
    return "tilePage";
  }
}
