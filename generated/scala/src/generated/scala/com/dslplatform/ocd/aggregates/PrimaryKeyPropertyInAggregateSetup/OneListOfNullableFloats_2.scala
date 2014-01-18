package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableFloats_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableFloats_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableFloats_2("+ URI +")"

   def copy(oneListOfNullableFloats: IndexedSeq[Option[Float]] = this._oneListOfNullableFloats): OneListOfNullableFloats_2 = {

  require(oneListOfNullableFloats ne null, "Null value was provided for property \"oneListOfNullableFloats\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableFloats)
    new OneListOfNullableFloats_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableFloats = oneListOfNullableFloats)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableFloats_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableFloats = result._oneListOfNullableFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableFloats_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableFloats = {
    _oneListOfNullableFloats
  }

  def oneListOfNullableFloats_= (value: IndexedSeq[Option[Float]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats") oneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableFloats = if (oneListOfNullableFloats == null) IndexedSeq.empty else oneListOfNullableFloats)

}

object OneListOfNullableFloats_2 extends AggregateRootCompanion[OneListOfNullableFloats_2]{

  def apply(
    oneListOfNullableFloats: IndexedSeq[Option[Float]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableFloats)
    require(oneListOfNullableFloats ne null, "Null value was provided for property \"oneListOfNullableFloats\"")
    new OneListOfNullableFloats_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableFloats = oneListOfNullableFloats)
  }

}
