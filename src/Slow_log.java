package com.my.db;

public class Slow_log {
  private java.sql.Timestamp start_time;
  private String user_host;
  private java.sql.Time query_time;
  private java.sql.Time lock_time;
  private Long rows_sent;
  private Long rows_examined;
  private String db;
  private Long last_insert_id;
  private Long insert_id;
  private Long server_id;
  private String sql_text;

  public java.sql.Timestamp getStart_time() {
    return start_time;
  }

  public void setStart_time(java.sql.Timestamp start_time) {
    this.start_time = start_time;
  }

  public String getUser_host() {
    return user_host;
  }

  public void setUser_host(String user_host) {
    this.user_host = user_host;
  }

  public java.sql.Time getQuery_time() {
    return query_time;
  }

  public void setQuery_time(java.sql.Time query_time) {
    this.query_time = query_time;
  }

  public java.sql.Time getLock_time() {
    return lock_time;
  }

  public void setLock_time(java.sql.Time lock_time) {
    this.lock_time = lock_time;
  }

  public Long getRows_sent() {
    return rows_sent;
  }

  public void setRows_sent(Long rows_sent) {
    this.rows_sent = rows_sent;
  }

  public Long getRows_examined() {
    return rows_examined;
  }

  public void setRows_examined(Long rows_examined) {
    this.rows_examined = rows_examined;
  }

  public String getDb() {
    return db;
  }

  public void setDb(String db) {
    this.db = db;
  }

  public Long getLast_insert_id() {
    return last_insert_id;
  }

  public void setLast_insert_id(Long last_insert_id) {
    this.last_insert_id = last_insert_id;
  }

  public Long getInsert_id() {
    return insert_id;
  }

  public void setInsert_id(Long insert_id) {
    this.insert_id = insert_id;
  }

  public Long getServer_id() {
    return server_id;
  }

  public void setServer_id(Long server_id) {
    this.server_id = server_id;
  }

  public String getSql_text() {
    return sql_text;
  }

  public void setSql_text(String sql_text) {
    this.sql_text = sql_text;
  }
}
