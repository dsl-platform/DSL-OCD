package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneDecimalWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneDecimalWithScaleOf9: BigDecimal
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDecimalWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneDecimalWithScaleOf9_3("+ URI +")"

   def copy(oneDecimalWithScaleOf9: BigDecimal = this._oneDecimalWithScaleOf9): OneDecimalWithScaleOf9_3 = {

  require(oneDecimalWithScaleOf9 ne null, "Null value was provided for property \"oneDecimalWithScaleOf9\"")
  com.dslplatform.api.Guards.checkScale(oneDecimalWithScaleOf9, 9)
    new OneDecimalWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneDecimalWithScaleOf9 = oneDecimalWithScaleOf9)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneDecimalWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._oneDecimalWithScaleOf9 = result._oneDecimalWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneDecimalWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneDecimalWithScaleOf9")
  def oneDecimalWithScaleOf9 = {
    _oneDecimalWithScaleOf9
  }

  def oneDecimalWithScaleOf9_= (value: BigDecimal) {
    com.dslplatform.api.Guards.checkScale(value, 9)
    _oneDecimalWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimalWithScaleOf9") oneDecimalWithScaleOf9: BigDecimal
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneDecimalWithScaleOf9 = if (oneDecimalWithScaleOf9 == null) _root_.scala.math.BigDecimal(0).setScale(9) else oneDecimalWithScaleOf9)

}

object OneDecimalWithScaleOf9_3 extends AggregateRootCompanion[OneDecimalWithScaleOf9_3]{

  def apply(
    oneDecimalWithScaleOf9: BigDecimal = _root_.scala.math.BigDecimal(0).setScale(9)
  ) = {
    com.dslplatform.api.Guards.checkScale(oneDecimalWithScaleOf9, 9)
    require(oneDecimalWithScaleOf9 ne null, "Null value was provided for property \"oneDecimalWithScaleOf9\"")
    new OneDecimalWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneDecimalWithScaleOf9 = oneDecimalWithScaleOf9)
  }

}
