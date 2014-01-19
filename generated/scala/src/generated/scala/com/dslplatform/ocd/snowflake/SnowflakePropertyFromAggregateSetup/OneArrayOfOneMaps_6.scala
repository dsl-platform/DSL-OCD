package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneMaps_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneMaps: Array[Map[String, String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneMaps_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneMaps_6("+ URI +")"

   def copy(oneArrayOfOneMaps: Array[Map[String, String]] = this._oneArrayOfOneMaps): OneArrayOfOneMaps_6 = {

  require(oneArrayOfOneMaps ne null, "Null value was provided for property \"oneArrayOfOneMaps\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMaps)
    new OneArrayOfOneMaps_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneMaps = oneArrayOfOneMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneMaps_6): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneMaps = result._oneArrayOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneMaps_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMaps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneMaps = {
    _oneArrayOfOneMaps
  }

  def oneArrayOfOneMaps_= (value: Array[Map[String, String]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMaps") oneArrayOfOneMaps: Array[Map[String, String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneMaps = if (oneArrayOfOneMaps == null) Array.empty else oneArrayOfOneMaps)

}

object OneArrayOfOneMaps_6 extends AggregateRootCompanion[OneArrayOfOneMaps_6]{

  def apply(
    oneArrayOfOneMaps: Array[Map[String, String]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMaps)
    require(oneArrayOfOneMaps ne null, "Null value was provided for property \"oneArrayOfOneMaps\"")
    new OneArrayOfOneMaps_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneMaps = oneArrayOfOneMaps)
  }

}
