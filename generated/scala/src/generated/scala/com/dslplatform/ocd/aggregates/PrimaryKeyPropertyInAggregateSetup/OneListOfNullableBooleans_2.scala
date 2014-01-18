package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableBooleans_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableBooleans_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableBooleans_2("+ URI +")"

   def copy(oneListOfNullableBooleans: IndexedSeq[Option[Boolean]] = this._oneListOfNullableBooleans): OneListOfNullableBooleans_2 = {

  require(oneListOfNullableBooleans ne null, "Null value was provided for property \"oneListOfNullableBooleans\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableBooleans)
    new OneListOfNullableBooleans_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableBooleans = oneListOfNullableBooleans)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableBooleans_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableBooleans = result._oneListOfNullableBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableBooleans_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfNullableBooleans")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableBooleans = {
    _oneListOfNullableBooleans
  }

  def oneListOfNullableBooleans_= (value: IndexedSeq[Option[Boolean]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBooleans") oneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableBooleans = if (oneListOfNullableBooleans == null) IndexedSeq.empty else oneListOfNullableBooleans)

}

object OneListOfNullableBooleans_2 extends AggregateRootCompanion[OneListOfNullableBooleans_2]{

  def apply(
    oneListOfNullableBooleans: IndexedSeq[Option[Boolean]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableBooleans)
    require(oneListOfNullableBooleans ne null, "Null value was provided for property \"oneListOfNullableBooleans\"")
    new OneListOfNullableBooleans_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableBooleans = oneListOfNullableBooleans)
  }

}
