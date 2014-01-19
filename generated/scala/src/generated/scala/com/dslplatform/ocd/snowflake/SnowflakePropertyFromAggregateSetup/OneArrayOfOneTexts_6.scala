package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneTexts_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneTexts: Array[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneTexts_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneTexts_6("+ URI +")"

   def copy(oneArrayOfOneTexts: Array[String] = this._oneArrayOfOneTexts): OneArrayOfOneTexts_6 = {

  require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)
    new OneArrayOfOneTexts_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneTexts = oneArrayOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneTexts_6): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneTexts = result._oneArrayOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneTexts_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneTexts = {
    _oneArrayOfOneTexts
  }

  def oneArrayOfOneTexts_= (value: Array[String]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts") oneArrayOfOneTexts: Array[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneTexts = if (oneArrayOfOneTexts == null) Array.empty else oneArrayOfOneTexts)

}

object OneArrayOfOneTexts_6 extends AggregateRootCompanion[OneArrayOfOneTexts_6]{

  def apply(
    oneArrayOfOneTexts: Array[String] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)
    require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
    new OneArrayOfOneTexts_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneTexts = oneArrayOfOneTexts)
  }

}
