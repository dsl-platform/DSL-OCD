package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneStringWithMaxLengthOf9_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneStringWithMaxLengthOf9: String
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneStringWithMaxLengthOf9_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneStringWithMaxLengthOf9_6("+ URI +")"

   def copy(oneStringWithMaxLengthOf9: String = this._oneStringWithMaxLengthOf9): OneStringWithMaxLengthOf9_6 = {

  require(oneStringWithMaxLengthOf9 ne null, "Null value was provided for property \"oneStringWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkLength(oneStringWithMaxLengthOf9, 9)
    new OneStringWithMaxLengthOf9_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneStringWithMaxLengthOf9 = oneStringWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneStringWithMaxLengthOf9_6): this.type = {
    this._URI = result._URI
    this._oneStringWithMaxLengthOf9 = result._oneStringWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneStringWithMaxLengthOf9_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneStringWithMaxLengthOf9")
  def oneStringWithMaxLengthOf9 = {
    _oneStringWithMaxLengthOf9
  }

  def oneStringWithMaxLengthOf9_= (value: String) {
    com.dslplatform.api.Guards.checkLength(value, 9)
    _oneStringWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneStringWithMaxLengthOf9") oneStringWithMaxLengthOf9: String
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneStringWithMaxLengthOf9 = if (oneStringWithMaxLengthOf9 == null) "" else oneStringWithMaxLengthOf9)

}

object OneStringWithMaxLengthOf9_6 extends AggregateRootCompanion[OneStringWithMaxLengthOf9_6]{

  def apply(
    oneStringWithMaxLengthOf9: String = ""
  ) = {
    com.dslplatform.api.Guards.checkLength(oneStringWithMaxLengthOf9, 9)
    require(oneStringWithMaxLengthOf9 ne null, "Null value was provided for property \"oneStringWithMaxLengthOf9\"")
    new OneStringWithMaxLengthOf9_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneStringWithMaxLengthOf9 = oneStringWithMaxLengthOf9)
  }

}
