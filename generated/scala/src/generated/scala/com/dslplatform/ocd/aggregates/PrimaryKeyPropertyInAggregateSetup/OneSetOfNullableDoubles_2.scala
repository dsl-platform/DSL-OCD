package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableDoubles_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableDoubles: Set[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableDoubles_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableDoubles_2("+ URI +")"

   def copy(oneSetOfNullableDoubles: Set[Option[Double]] = this._oneSetOfNullableDoubles): OneSetOfNullableDoubles_2 = {

  require(oneSetOfNullableDoubles ne null, "Null value was provided for property \"oneSetOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableDoubles)
    new OneSetOfNullableDoubles_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableDoubles = oneSetOfNullableDoubles)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDoubles_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableDoubles = result._oneSetOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDoubles_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableDoubles = {
    _oneSetOfNullableDoubles
  }

  def oneSetOfNullableDoubles_= (value: Set[Option[Double]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles") oneSetOfNullableDoubles: Set[Option[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableDoubles = if (oneSetOfNullableDoubles == null) Set.empty else oneSetOfNullableDoubles)

}

object OneSetOfNullableDoubles_2 extends AggregateRootCompanion[OneSetOfNullableDoubles_2]{

  def apply(
    oneSetOfNullableDoubles: Set[Option[Double]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableDoubles)
    require(oneSetOfNullableDoubles ne null, "Null value was provided for property \"oneSetOfNullableDoubles\"")
    new OneSetOfNullableDoubles_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableDoubles = oneSetOfNullableDoubles)
  }

}
