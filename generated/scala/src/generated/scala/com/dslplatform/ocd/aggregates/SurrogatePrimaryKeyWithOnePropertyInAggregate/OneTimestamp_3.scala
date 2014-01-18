package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneTimestamp_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneTimestamp: org.joda.time.DateTime
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneTimestamp_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneTimestamp_3("+ URI +")"

   def copy(oneTimestamp: org.joda.time.DateTime = this._oneTimestamp): OneTimestamp_3 = {

  require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")
    new OneTimestamp_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneTimestamp = oneTimestamp)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneTimestamp_3): this.type = {
    this._URI = result._URI
    this._oneTimestamp = result._oneTimestamp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneTimestamp_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp")
  def oneTimestamp = {
    _oneTimestamp
  }

  def oneTimestamp_= (value: org.joda.time.DateTime) {
    _oneTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp)

}

object OneTimestamp_3 extends AggregateRootCompanion[OneTimestamp_3]{

  def apply(
    oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) = {
    require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")
    new OneTimestamp_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneTimestamp = oneTimestamp)
  }

}
