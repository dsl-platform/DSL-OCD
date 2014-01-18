package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableFloats_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableFloats: Set[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableFloats_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableFloats_2("+ URI +")"

   def copy(oneSetOfNullableFloats: Set[Option[Float]] = this._oneSetOfNullableFloats): OneSetOfNullableFloats_2 = {

  require(oneSetOfNullableFloats ne null, "Null value was provided for property \"oneSetOfNullableFloats\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableFloats)
    new OneSetOfNullableFloats_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableFloats = oneSetOfNullableFloats)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableFloats_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableFloats = result._oneSetOfNullableFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableFloats_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableFloats = {
    _oneSetOfNullableFloats
  }

  def oneSetOfNullableFloats_= (value: Set[Option[Float]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableFloats") oneSetOfNullableFloats: Set[Option[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableFloats = if (oneSetOfNullableFloats == null) Set.empty else oneSetOfNullableFloats)

}

object OneSetOfNullableFloats_2 extends AggregateRootCompanion[OneSetOfNullableFloats_2]{

  def apply(
    oneSetOfNullableFloats: Set[Option[Float]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableFloats)
    require(oneSetOfNullableFloats ne null, "Null value was provided for property \"oneSetOfNullableFloats\"")
    new OneSetOfNullableFloats_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableFloats = oneSetOfNullableFloats)
  }

}
