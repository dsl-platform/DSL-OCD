package com.dslplatform.ocd.projects.Client

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class Project @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: java.util.UUID,
    private var _UserID: String,
    private var _ApplicationServer: String,
    private var _ApplicationName: String,
    private var _Nick: Option[String],
    private var _CreatedAt: org.joda.time.DateTime
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: Project => c.URI == URI
    case _ => false
  }

  override def toString = "Project("+ URI +")"

   def copy(UserID: String = this._UserID, ApplicationServer: String = this._ApplicationServer, ApplicationName: String = this._ApplicationName, Nick: Option[String] = this._Nick, CreatedAt: org.joda.time.DateTime = this._CreatedAt): Project = {

  require(UserID ne null, "Null value was provided for property \"UserID\"")
  require(ApplicationServer ne null, "Null value was provided for property \"ApplicationServer\"")
  require(ApplicationName ne null, "Null value was provided for property \"ApplicationName\"")
  require(Nick ne null, "Null value was provided for property \"Nick\"")
  if(Nick.isDefined) require(Nick.get ne null, "Null value was provided for property \"Nick\"")
  require(CreatedAt ne null, "Null value was provided for property \"CreatedAt\"")
    new Project(_URI = this.URI, __locator = this.__locator, _ID = _ID, _UserID = UserID, _ApplicationServer = ApplicationServer, _ApplicationName = ApplicationName, _Nick = Nick, _CreatedAt = CreatedAt)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: java.util.UUID) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.projects.Client.Project): this.type = {
    this._URI = result._URI
    this._UserID = result._UserID
    this._ApplicationServer = result._ApplicationServer
    this._ApplicationName = result._ApplicationName
    this._Nick = result._Nick
    this._CreatedAt = result._CreatedAt
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.projects.Client.Project](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("UserID")
  def UserID = {
    _UserID
  }

  def UserID_= (value: String) {
    _UserID = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("ApplicationServer")
  def ApplicationServer = {
    _ApplicationServer
  }

  def ApplicationServer_= (value: String) {
    _ApplicationServer = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("ApplicationName")
  def ApplicationName = {
    _ApplicationName
  }

  def ApplicationName_= (value: String) {
    _ApplicationName = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("Nick")
  def Nick = {
    _Nick
  }

  def Nick_= (value: Option[String]) {
    _Nick = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("CreatedAt")
  def CreatedAt = {
    _CreatedAt
  }

  def CreatedAt_= (value: org.joda.time.DateTime) {
    _CreatedAt = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: java.util.UUID
  , @com.fasterxml.jackson.annotation.JsonProperty("UserID") UserID: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ApplicationServer") ApplicationServer: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ApplicationName") ApplicationName: String
  , @com.fasterxml.jackson.annotation.JsonProperty("Nick") Nick: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("CreatedAt") CreatedAt: org.joda.time.DateTime
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = if (ID == null) java.util.UUID.randomUUID else ID, _UserID = if (UserID == null) "" else UserID, _ApplicationServer = if (ApplicationServer == null) "" else ApplicationServer, _ApplicationName = if (ApplicationName == null) "" else ApplicationName, _Nick = Nick, _CreatedAt = if (CreatedAt == null) org.joda.time.DateTime.now else CreatedAt)

}

object Project extends AggregateRootCompanion[Project]{

  def apply(
    UserID: String = ""
  , ApplicationServer: String = ""
  , ApplicationName: String = ""
  , Nick: Option[String] = None
  , CreatedAt: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) = {
    require(UserID ne null, "Null value was provided for property \"UserID\"")
    require(ApplicationServer ne null, "Null value was provided for property \"ApplicationServer\"")
    require(ApplicationName ne null, "Null value was provided for property \"ApplicationName\"")
    require(Nick ne null, "Null value was provided for property \"Nick\"")
    if (Nick.isDefined) require(Nick.get ne null, "Null value was provided for property \"Nick\"")
    require(CreatedAt ne null, "Null value was provided for property \"CreatedAt\"")
    new Project(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = java.util.UUID.randomUUID
    , _UserID = UserID
    , _ApplicationServer = ApplicationServer
    , _ApplicationName = ApplicationName
    , _Nick = Nick
    , _CreatedAt = CreatedAt)
  }

}
