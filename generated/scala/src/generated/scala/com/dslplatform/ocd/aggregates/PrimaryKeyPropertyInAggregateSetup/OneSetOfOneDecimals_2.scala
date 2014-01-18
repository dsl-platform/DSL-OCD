package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneDecimals_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneDecimals: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneDecimals_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneDecimals_2("+ URI +")"

   def copy(oneSetOfOneDecimals: Set[BigDecimal] = this._oneSetOfOneDecimals): OneSetOfOneDecimals_2 = {

  require(oneSetOfOneDecimals ne null, "Null value was provided for property \"oneSetOfOneDecimals\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimals)
    new OneSetOfOneDecimals_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneDecimals = oneSetOfOneDecimals)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneDecimals_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneDecimals = result._oneSetOfOneDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneDecimals_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneDecimals = {
    _oneSetOfOneDecimals
  }

  def oneSetOfOneDecimals_= (value: Set[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimals") oneSetOfOneDecimals: Set[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneDecimals = if (oneSetOfOneDecimals == null) Set.empty else oneSetOfOneDecimals)

}

object OneSetOfOneDecimals_2 extends AggregateRootCompanion[OneSetOfOneDecimals_2]{

  def apply(
    oneSetOfOneDecimals: Set[BigDecimal] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimals)
    require(oneSetOfOneDecimals ne null, "Null value was provided for property \"oneSetOfOneDecimals\"")
    new OneSetOfOneDecimals_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneDecimals = oneSetOfOneDecimals)
  }

}
