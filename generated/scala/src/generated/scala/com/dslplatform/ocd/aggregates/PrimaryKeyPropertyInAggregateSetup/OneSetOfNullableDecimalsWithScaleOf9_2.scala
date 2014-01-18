package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableDecimalsWithScaleOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableDecimalsWithScaleOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableDecimalsWithScaleOf9_2("+ URI +")"

   def copy(oneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]] = this._oneSetOfNullableDecimalsWithScaleOf9): OneSetOfNullableDecimalsWithScaleOf9_2 = {

  require(oneSetOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfNullableDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionOptionScale(oneSetOfNullableDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimalsWithScaleOf9)
    new OneSetOfNullableDecimalsWithScaleOf9_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableDecimalsWithScaleOf9 = oneSetOfNullableDecimalsWithScaleOf9)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDecimalsWithScaleOf9_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableDecimalsWithScaleOf9 = result._oneSetOfNullableDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDecimalsWithScaleOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfNullableDecimalsWithScaleOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableDecimalsWithScaleOf9 = {
    _oneSetOfNullableDecimalsWithScaleOf9
  }

  def oneSetOfNullableDecimalsWithScaleOf9_= (value: Set[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimalsWithScaleOf9") oneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableDecimalsWithScaleOf9 = if (oneSetOfNullableDecimalsWithScaleOf9 == null) Set.empty else oneSetOfNullableDecimalsWithScaleOf9)

}

object OneSetOfNullableDecimalsWithScaleOf9_2 extends AggregateRootCompanion[OneSetOfNullableDecimalsWithScaleOf9_2]{

  def apply(
    oneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionScale(oneSetOfNullableDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimalsWithScaleOf9)
    require(oneSetOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfNullableDecimalsWithScaleOf9\"")
    new OneSetOfNullableDecimalsWithScaleOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableDecimalsWithScaleOf9 = oneSetOfNullableDecimalsWithScaleOf9)
  }

}
