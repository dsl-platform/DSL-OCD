package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableDecimals_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableDecimals_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableDecimals_2("+ URI +")"

   def copy(oneSetOfNullableDecimals: Set[Option[BigDecimal]] = this._oneSetOfNullableDecimals): OneSetOfNullableDecimals_2 = {

  require(oneSetOfNullableDecimals ne null, "Null value was provided for property \"oneSetOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimals)
    new OneSetOfNullableDecimals_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableDecimals = oneSetOfNullableDecimals)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDecimals_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableDecimals = result._oneSetOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDecimals_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableDecimals = {
    _oneSetOfNullableDecimals
  }

  def oneSetOfNullableDecimals_= (value: Set[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals") oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableDecimals = if (oneSetOfNullableDecimals == null) Set.empty else oneSetOfNullableDecimals)

}

object OneSetOfNullableDecimals_2 extends AggregateRootCompanion[OneSetOfNullableDecimals_2]{

  def apply(
    oneSetOfNullableDecimals: Set[Option[BigDecimal]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimals)
    require(oneSetOfNullableDecimals ne null, "Null value was provided for property \"oneSetOfNullableDecimals\"")
    new OneSetOfNullableDecimals_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableDecimals = oneSetOfNullableDecimals)
  }

}
