package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneInteger_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneInteger: Int
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneInteger_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneInteger_2("+ URI +")"

   def copy(oneInteger: Int = this._oneInteger): OneInteger_2 = {

    new OneInteger_2(_URI = this.URI, __locator = this.__locator, _oneInteger = oneInteger)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneInteger_2): this.type = {
    this._URI = result._URI
    this._oneInteger = result._oneInteger
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneInteger_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneInteger")
  def oneInteger = {
    _oneInteger
  }

  def oneInteger_= (value: Int) {
    _oneInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneInteger") oneInteger: Int
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneInteger = oneInteger)

}

object OneInteger_2 extends AggregateRootCompanion[OneInteger_2]{

  def apply(
    oneInteger: Int = 0
  ) = {
    new OneInteger_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneInteger = oneInteger)
  }

}
