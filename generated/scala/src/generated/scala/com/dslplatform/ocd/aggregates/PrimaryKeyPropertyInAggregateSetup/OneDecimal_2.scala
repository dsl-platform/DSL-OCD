package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneDecimal_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneDecimal: BigDecimal
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDecimal_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneDecimal_2("+ URI +")"

   def copy(oneDecimal: BigDecimal = this._oneDecimal): OneDecimal_2 = {

  require(oneDecimal ne null, "Null value was provided for property \"oneDecimal\"")
    new OneDecimal_2(_URI = this.URI, __locator = this.__locator, _oneDecimal = oneDecimal)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneDecimal_2): this.type = {
    this._URI = result._URI
    this._oneDecimal = result._oneDecimal
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneDecimal_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal")
  def oneDecimal = {
    _oneDecimal
  }

  def oneDecimal_= (value: BigDecimal) {
    _oneDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal") oneDecimal: BigDecimal
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneDecimal = if (oneDecimal == null) _root_.scala.math.BigDecimal(0) else oneDecimal)

}

object OneDecimal_2 extends AggregateRootCompanion[OneDecimal_2]{

  def apply(
    oneDecimal: BigDecimal = _root_.scala.math.BigDecimal(0)
  ) = {
    require(oneDecimal ne null, "Null value was provided for property \"oneDecimal\"")
    new OneDecimal_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneDecimal = oneDecimal)
  }

}
