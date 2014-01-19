package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneDecimalsWithScaleOf9_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneDecimalsWithScaleOf9_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneDecimalsWithScaleOf9_6("+ URI +")"

   def copy(oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal] = this._oneSetOfOneDecimalsWithScaleOf9): OneSetOfOneDecimalsWithScaleOf9_6 = {

  require(oneSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfOneDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionScale(oneSetOfOneDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimalsWithScaleOf9)
    new OneSetOfOneDecimalsWithScaleOf9_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneDecimalsWithScaleOf9 = oneSetOfOneDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneDecimalsWithScaleOf9_6): this.type = {
    this._URI = result._URI
    this._oneSetOfOneDecimalsWithScaleOf9 = result._oneSetOfOneDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneDecimalsWithScaleOf9_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimalsWithScaleOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneDecimalsWithScaleOf9 = {
    _oneSetOfOneDecimalsWithScaleOf9
  }

  def oneSetOfOneDecimalsWithScaleOf9_= (value: Set[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimalsWithScaleOf9") oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneDecimalsWithScaleOf9 = if (oneSetOfOneDecimalsWithScaleOf9 == null) Set.empty else oneSetOfOneDecimalsWithScaleOf9)

}

object OneSetOfOneDecimalsWithScaleOf9_6 extends AggregateRootCompanion[OneSetOfOneDecimalsWithScaleOf9_6]{

  def apply(
    oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionScale(oneSetOfOneDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimalsWithScaleOf9)
    require(oneSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfOneDecimalsWithScaleOf9\"")
    new OneSetOfOneDecimalsWithScaleOf9_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneDecimalsWithScaleOf9 = oneSetOfOneDecimalsWithScaleOf9)
  }

}
